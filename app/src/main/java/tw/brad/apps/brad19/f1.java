package tw.brad.apps.brad19;
//
//public View onCreateView(LayoutInflater inflater, ViewGroup container, //點選下別得頁面再回來,會重新創造頁面
//        Bundle savedInstanceState) {
//        //目標是本來按下去按鈕二回來,樂透訊息會重新,血判斷式保留
//        if (mainView == null) {//如果你頁面一開始不是空的,就做以下事情
//        mainView = inflater.inflate(R.layout.fragment_f1, container, false); //(1.浮現出版面)
//
//        tv = mainView.findViewById(R.id.f1_tv);//抓到顯示頁面
//
//        btn = mainView.findViewById(R.id.f1_btn);//在主畫面裡面,去找到她肚子裡的f1按鈕
//        btn.setOnClickListener(new View.OnClickListener() { //這個按鈕設置是件,(螢幕的點擊事件)
//@Override
//public void onClick(View view) {
//        f1BtnClick(); //點下去觸發產生熱透

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class f1 extends Fragment { //當Fragment叫我進去時,
    private MainActivity mainActivity;
    private View mainView;
    private TextView tv;
    private Button btn, btn2, btn3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (mainView == null) {
            mainView = inflater.inflate(R.layout.fragment_f1, container, false);

            tv = mainView.findViewById(R.id.f1_tv);

            btn = mainView.findViewById(R.id.f1_btn);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    f1BtnClick();
                }
            });
            btn2 = mainView.findViewById(R.id.f1_btn2);
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    f1Btn2Click();
                }
            });
            btn3 = mainView.findViewById(R.id.f1_btn3);
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    f1Btn3Click();
                }
            });
        }

        return mainView;
    }

    private void f1BtnClick(){
        tv.setText("Lottery:" + (int)(Math.random()*38+1));
    }
    private void f1Btn2Click(){
        mainActivity.setMainTitle("Hello, Brad");
    }
    private void f1Btn3Click(){
        mainActivity.getF2().setF2Title("Hello, World");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof MainActivity){
            Log.v("brad", "OK");
        }

        mainActivity = (MainActivity)context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.v("brad", "onDetach");
    }

}