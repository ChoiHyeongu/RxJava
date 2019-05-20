
package songpatechnicalhighschool.motivation.hellorx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import io.reactivex.Observable;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.text_view);
        Observable.just(textView.getText().toString())
                .map(s -> s + "Rx!")
                .subscribe(text -> textView.setText(text));

    }
}
