package xiaokong.kong;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import xiaokong.kong.widget.ScrollTextView;

public class MainActivity extends AppCompatActivity {

    private ScrollTextView scroolTextView;

    int count = 99;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scroolTextView = (ScrollTextView) findViewById(R.id.scrool_text_view);

        notifyData();

    }

    private void notifyData() {
        scroolTextView.setTextNum(String.valueOf(count));
    }


    public void add1Click(View v) {
        count++;
        notifyData();
    }

    public void add2Click(View v) {
        count += 2;
        notifyData();
    }

    public void sub1Click(View v) {
        count--;
        notifyData();
    }

    public void sub2Click(View v) {
        count -= 2;
        notifyData();

    }

}
