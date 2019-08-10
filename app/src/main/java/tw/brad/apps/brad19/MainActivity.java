package tw.brad.apps.brad19;
//版面設計
//版面搭配頁簽更換
//android fragment
//一開始顯現f1的畫面
//這個頁面是處理4個頁簽連接，掌管四個人的頁面，但盡量不處理４個人做的事情
//FragmentTransaction transaction = fmgr.beginTransaction();
//        transaction.replace(R.id.container, f1); //因為已經有東西,所以用replace(設定好的頁面,物件frgament)
//
//        FragmentTransaction transaction = fmgr.beginTransaction(); //透過經理人的開始交易,取得交易
//        transaction.add(R.id.container, f1); //要把這個f1放到(我設定好的頁面,物件);一開始沒東西用add
//        transaction.commit(); //把這件事情處理
//
//
//        fmgr = getSupportFragmentManager(); // 透過這招取得Fragment經理人
//        f1 = new f1(); //取得我們做好的f1頁面物件實體
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fmgr;
    private f1 f1;
    private f2 f2;
    private f3 f3;
    private f4 f4;
    private TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fmgr = getSupportFragmentManager(); // 透過這招取得Fragment經理人
        f1 = new f1(); //取得我們做好的f1頁面物件實體
        f2 = new f2();
        f3 = new f3();
        f4 = new f4();


        FragmentTransaction transaction = fmgr.beginTransaction(); //透過經理人的開始交易,取得交易
        transaction.add(R.id.container, f1); //要把這個f1放到(我設定好的頁面,物件);一開始沒東西用add
        transaction.commit(); //把這件事情處理
    }

    public void setMainTitle(String titleString){
        title.setText(titleString);
    }
    public f2 getF2(){
        return f2;
    }

    public void test1(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f1);
        transaction.commit();
    }

    public void test2(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f2);
        transaction.commit();
    }

    public void test3(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f3);
        transaction.commit();
    }

    public void test4(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f4);
        transaction.commit();
    }

}