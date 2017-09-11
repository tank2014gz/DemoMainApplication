package com.example.yuliyan.demomainapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yuliyan.demomainapplication.model.ConfigFile;
import com.example.yuliyan.demomainapplication.model.MainConfigFile;


/**
 * 七牛服务器部署文件（）
 */
public class MainActivity extends AppCompatActivity {


    private MainConfigFile mainConfigFile=new MainConfigFile();



//    private void configInit(){
//        ConfigFile mainConfig=new ConfigFile();
//        mainConfig.setApkFile("");
//        mainConfig.setMainApkNumber(1);
//        mainConfig.setUpdate(false);
//        mainConfig.setUpdateTime();
//    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
