package pooa20181.iff.edu.br.androidprojectpooa.activity;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;

import pooa20181.iff.edu.br.androidprojectpooa.R;

public class Login extends AppCompatActivity implements View.OnClickListener, GoogleApiClient.OnConnectionFailedListener{

    private SignInButton SignIn;
    private GoogleApiClient googleApiClient;
    private static final int REQUEST_CODE = 9001;
    private TextView tWelcome, tLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        SignIn = (SignInButton) findViewById(R.id.BtnLogin);
        tWelcome = (TextView) findViewById(R.id.tvLogin);
        tLogin = (TextView) findViewById(R.id.tvBV);

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
