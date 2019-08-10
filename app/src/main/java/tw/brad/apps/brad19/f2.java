package tw.brad.apps.brad19;
//產生計時器



import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;
/**
 * A simple {@link Fragment} subclass.
 */
public class f2 extends Fragment {
    private View mainView;
    private TextView tv, title;
    private Timer timer;
    private int iCounter;
    private UIHandler handler;

    public f2(){
        handler = new UIHandler();
        timer = new Timer();
        timer.schedule(new MyTask(), 0, 1000);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (mainView == null) {
            mainView = inflater.inflate(R.layout.fragment_f2, container, false);
            tv = mainView.findViewById(R.id.f2_tv);
            title = mainView.findViewById(R.id.f2_title);
        }
        return mainView;
    }

    public void setF2Title(String titleString){
        if (title != null) {
            title.setText(titleString);
        }
    }
    private class MyTask extends TimerTask {
        @Override
        public void run() {
            if (tv !=null){
                iCounter++;
                handler.sendEmptyMessage(0);
            }
        }
    }

    private class UIHandler extends Handler {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            tv.setText("" + iCounter);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}