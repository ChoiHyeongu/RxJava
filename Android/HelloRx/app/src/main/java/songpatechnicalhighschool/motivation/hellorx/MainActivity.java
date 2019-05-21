
package songpatechnicalhighschool.motivation.hellorx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.text_view);
        Observable.just(textView.getText().toString())
                .map(s -> s + "Rx!")
                .subscribe(text -> textView.setText(text));

//        Observable
        //               .just(1, 2, 3, 4, 5)
        //             .filter(new Func1<Integer, Boolean>() {
        //                  @Override
        //               public Boolean call(Integer integer) {
        //                 return integer % 2 != 0;
        //           }
        //     });

        Observer<Integer> observer = new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("New data received : " + integer);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Error received : " + e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("All data emitted.");
            }
        };
    }
}