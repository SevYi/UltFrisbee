package com.example.ultfrisbee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.xu_gx.ultfrisbee.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//在活动中加载一个布局
        Button LoginButton = (Button) findViewById(R.id.Login);//获取button对象实例
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 *Toast.makeText(MainActivity.this,"You clicked button",Toast.LENGTH_SHORT).show();
                 *提示弹窗
                 */
                //切换活动,显式Intent
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);

                /**
                 Intent intent = new Intent("com.example.xu_gx.ultfrisbee.LOGIN_ACTION_START");
                 startActivity(intent);
                  //切换活动，隐式Intent，类似于发送Event，在AndroidManifest.xml中相应该Intent
                 */
            }
        });//设定button点击动作
    }

    @Override//重写菜单方法。返回值T：显示创建的菜单；F：无法显示创建的菜单。
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);//为当前活动创建菜单
        return true;
    }

    @Override//定义菜单响应事件
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                /**
                 * Nothing
                 */
                break;
            case R.id.remove_item:
                /**
                 * Nothing
                 */
                break;
            default:
        }
        return true;
    }
}
