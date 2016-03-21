package com.jijjy.grace.callback;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.pddstudio.talking.Talk;
import com.pddstudio.talking.model.SpeechObject;

import java.security.PublicKey;


public class MainActivity extends AppCompatActivity implements Talk.Callback{

    TextView statusText;
    TextView wordText;
    Button listenBtn;
    EditText commandText;
    Button addCmdBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Talk.init(this, this);

        Talk.getInstance().addSpeechObjects(helloObject, jay, jojo, grace, moringa);

        statusText = (TextView) findViewById(R.id.statusLabel);
        wordText = (TextView) findViewById(R.id.textLabel);

        listenBtn = (Button) findViewById(R.id.listenBtn);
        listenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hasPermission()) {
                    Talk.getInstance().startListening();
                } else {
                    requestPermission();
                }
            }
        });

        commandText = (EditText) findViewById(R.id.cmdText);
        addCmdBtn = (Button) findViewById(R.id.addBtn);
        addCmdBtn.setOnClickListener(addCommandListener);
    }

    private boolean hasPermission(){
        return ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) == PackageManager.PERMISSION_GRANTED;
    }

    private void requestPermission() {
        if(ContextCompat.checkSelfPermission(this,Manifest.permission.RECORD_AUDIO) == PackageManager.PERMISSION_DENIED) {
            ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.RECORD_AUDIO}, 42);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String permissions[], @NonNull int[] grantResults) {
        if (requestCode == 42 && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED);
            listenBtn.performClick();
    }

    @Override
    public void onDestroy() {
        Talk.getInstance().stopListening();
        super.onDestroy();
    }

    /*
    TALK LIBRARY CALLBACK
     */



    @Override
    public void onStartListening() {
        statusText.setText("Listening");
        listenBtn.setEnabled(false);
    }

    @Override
    public void onRmsChanged(float rms) {

    }

    @Override
    public void onFailedListening(int errorCode){
        statusText.setText("Listening Failed.. [" + errorCode + "]");
        wordText.setText("");
        listenBtn.setEnabled(true);
    }

    @Override
    public void onFinishedListening(SpeechObject speechObject){
        statusText.setText("Finished Listening!");
        if(speechObject != null){
            speechObject.onSpeechObjectIdentified();
        }
        listenBtn.setEnabled(true);
    }

    /*
    SOME TEST TEXT OBJECTS
     */

    private SpeechObject helloObject = new SpeechObject() {
        @Override
        public void onSpeechObjectIdentified() {
        wordText.setText("Recognized: Hello");
        }

        @Override
        public String getVoiceString() {
            return "hello";
        }

    };


    private SpeechObject jay = new SpeechObject() {
        @Override
        public void onSpeechObjectIdentified() {
            wordText.setText("Recognized: Jay");
        }

        @Override
        public String getVoiceString() {
            return "jay";
        }

    };


    private SpeechObject jojo = new SpeechObject() {
        @Override
        public void onSpeechObjectIdentified() {
            wordText.setText("Recognized: Jojo");
        }

        @Override
        public String getVoiceString() {
            return "jojo";
        }

    };


    private SpeechObject grace = new SpeechObject() {
        @Override
        public void onSpeechObjectIdentified() {
            wordText.setText("Recognized: Grace");
        }

        @Override
        public String getVoiceString() {
            return "grace";
        }

    };


    private SpeechObject moringa = new SpeechObject() {
        @Override
        public void onSpeechObjectIdentified() {
            wordText.setText("Recognized: Moringa iko tu sawa");
        }

        @Override
        public String getVoiceString() {
            return "Moringa iko tu sawa";
        }

    };

    private View.OnClickListener addCommandListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (commandText.getText() != null && !commandText.getText().toString().isEmpty()) {
                CustomObject customObject = new CustomObject(MainActivity.this, commandText.getText().toString());
                Talk.getInstance().addSpeechObjects(customObject);
                statusText.setText("Added: " + commandText.getText().toString());
                commandText.setText("");
            }
        }
    };

}
