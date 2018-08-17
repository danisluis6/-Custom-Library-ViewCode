package viewcode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import viewcode.codeview.CodeView;
import viewcode.codeview.CodeViewTheme;
import viewcode.mcode.R;

public class MainActivity extends AppCompatActivity {

    CodeView codeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        codeView=(CodeView)findViewById(R.id.codeview);
        codeView.setTheme(CodeViewTheme.ANDROIDSTUDIO);
        codeView.fillColor();

        codeView.showCode(Constant.CODE);
    }
}
