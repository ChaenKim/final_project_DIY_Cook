package example.com.samsung.final_project_diy_cook.Activity;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

import example.com.samsung.final_project_diy_cook.Handler.BackPressCloseHandler;
import example.com.samsung.final_project_diy_cook.R;

public class LoginActivity extends AppCompatActivity {

    BackPressCloseHandler backPress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        backPress = new BackPressCloseHandler(this);
    }

    public void signupBtnOnClick(View view){
        final Intent intent =  new Intent(this, SignupActivity.class);
        startActivity(intent);
        //이부분에 기존에 로그인 폼에 입력했던 값들 다 비워주는 것도 추가하기
    }

    public void loginBtnOnClick(View view){
        final Intent intent = new Intent(this, MainActivity.class);
        //로그인 성공시 메인화면으로 이동하도록 하기.
        startActivity(intent);
        finish();
    }
    @Override
    public void onBackPressed() {
        backPress.onBackPressed();
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        if (drawer.isDrawerOpen(GravityCompat.START)) {
//            drawer.closeDrawer(GravityCompat.START);
//        } else {
//            super.onBackPressed();
//        }
    }

}
