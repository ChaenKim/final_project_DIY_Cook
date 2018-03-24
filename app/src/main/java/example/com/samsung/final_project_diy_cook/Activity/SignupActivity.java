package example.com.samsung.final_project_diy_cook.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import example.com.samsung.final_project_diy_cook.Handler.BackPressCloseHandler;
import example.com.samsung.final_project_diy_cook.R;

public class SignupActivity extends AppCompatActivity {

    BackPressCloseHandler backPress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if ((keyCode == KeyEvent.KEYCODE_BACK))
        {
            this.finish();
        }
        return super.onKeyDown(keyCode, event);
    }

    public void onBackPressed() {
        this.finish();
    }

    public void cancelBtnOnClick(View view){
        this.finish();
    }
}
