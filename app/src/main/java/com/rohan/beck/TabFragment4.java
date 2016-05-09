package com.rohan.beck;

/**
 * Created by Rohan on 2/2/2016.
 */
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TabFragment4 extends Fragment {
    private EditText rollnumber;
    TextView mTextView;
    TextView result;
    Button b;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View rootView =  inflater.inflate(R.layout.tab_fragment_4, container, false);
        rollnumber = (EditText)rootView.findViewById(R.id.editText);
        result = (TextView)rootView.findViewById(R.id.textView3);
        b = (Button)rootView.findViewById(R.id.button);
        b.setOnClickListener(onClickListener);
        //result.setText("hello man");
        //b.setOnClickListener();
        return rootView;
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String roll = rollnumber.getText().toString();
            new Check(getContext(), result).execute(roll);

        }
    };


}




