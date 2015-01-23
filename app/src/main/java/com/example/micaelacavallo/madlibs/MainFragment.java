package com.example.micaelacavallo.madlibs;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    Button mShowMe;
    EditText mRelative1;
    EditText mRelative2;
    EditText mAdjective1;
    EditText mAdjective2;
    EditText mAdjective3;
    EditText mVerbEd;
    EditText mVerbIng;
    EditText mNamePersonInRoom;
    EditText mName;
    EditText mBodyPart;
    Boolean[] state;
    String[] words;

    public static String FORM_STATE = "FORM_STATE";

    public MainFragment() {
        // Required empty public constructor
    }

    private static class FormState implements Parcelable{

        Boolean mAdjective1;
        public Boolean getmAdjective1()
        {
            return mAdjective1;
        }
        public void setmAdjective1(Boolean mAdjective1)
        {
            this.mAdjective1 = mAdjective1;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(mAdjective1?1:0);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        state = new Boolean[10];
        words = new String[10];
        for (int x = 0; x<10; x++)
        {
            state[x] = true;
        }
        prepareEditTextRelative1();
        prepareEditTextRelative2();
        prepareEditTextAdjective1();
        prepareEditTextAdjective2();
        prepareEditTextAdjective3();
        prepareEditTextVerbEd();
        prepareEditTextVerbIng();
        prepareEditTextNamePersonInRoom();
        prepareEditTextName();
        prepareEditTextBodyPart();
        prepareShowMe();
    }

    private void prepareEditTextBodyPart() {
        mBodyPart = (EditText)getView().findViewById(R.id.body_part);
        mBodyPart.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(s))
                {
                    state[0] = true;
                }
                else
                {
                    state[0] = false;
                    words[0] = mBodyPart.getText().toString();
                }
                toggleButton();
            }
        });
    }

    private void prepareEditTextName() {
        mName = (EditText)getView().findViewById(R.id.name);
        mName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(s))
                {
                    state[1] = true;
                }
                else
                {
                    state[1] = false;
                    words[1] = mName.getText().toString();
                }
                toggleButton();
            }
        });
    }

    private void prepareEditTextNamePersonInRoom() {
        mNamePersonInRoom = (EditText)getView().findViewById(R.id.name_of_person);
        mNamePersonInRoom.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(s)) {
                    state[2] = true;
                } else {
                    state[2] = false;
                    words[2] = mNamePersonInRoom.getText().toString();
                }
                toggleButton();
            }
        });
    }

    private void prepareEditTextVerbIng() {
        mVerbIng = (EditText)getView().findViewById(R.id.verb_ing);
        mVerbIng.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(s))
                {
                    state[3] = true;
                }
                else
                {
                    state[3] = false;
                    words[3] = mVerbIng.getText().toString();
                }
                toggleButton();
            }
        });
    }

    private void prepareEditTextVerbEd() {
        mVerbEd = (EditText)getView().findViewById(R.id.verb_ed);
        mVerbEd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(s))
                {
                    state[4] = true;
                }
                else
                {
                    state[4] = false;
                    words[4] = mVerbEd.getText().toString();
                }
                toggleButton();
            }
        });
    }

    private void prepareEditTextAdjective3() {
        mAdjective3 = (EditText)getView().findViewById(R.id.adjective3);
        mAdjective3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(s))
                {
                    state[5] = true;
                }
                else
                {
                    state[5] = false;
                    words[5] = mAdjective3.getText().toString();
                }
                toggleButton();
            }
        });
    }

    private void prepareEditTextAdjective2() {
        mAdjective2 = (EditText)getView().findViewById(R.id.adjective2);
        mAdjective2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(s))
                {
                    state[6] = true;
                }
                else
                {
                    state[6] = false;
                    words[6] = mAdjective2.getText().toString();
                }
                toggleButton();
            }
        });
    }

    private void prepareEditTextAdjective1() {
        mAdjective1 = (EditText)getView().findViewById(R.id.adjective1);
        mAdjective1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(s))
                {
                    state[7] = true;
                }
                else
                {
                    state[7] = false;
                    words[7] = mAdjective1.getText().toString();
                }
                toggleButton();
            }
        });
    }

    private void prepareEditTextRelative2() {
        mRelative2 = (EditText)getView().findViewById(R.id.relative2);
        mRelative2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(s))
                {
                    state[8] = true;
                }
                else
                {
                    state[8] = false;
                    words[8] = mRelative2.getText().toString();
                }
                toggleButton();
            }
        });
    }

    private void prepareEditTextRelative1() {
        mRelative1 = (EditText)getView().findViewById(R.id.relative1);
        mRelative1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(s))
                {
                    state[9] = true;
                }
                else
                {
                    state[9] = false;
                    words[9] = mRelative1.getText().toString();
                }
                toggleButton();
            }
        });
    }

    private void prepareShowMe() {
        mShowMe = (Button)getView().findViewById(R.id.show_me);
        mShowMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ResultsActivity.class);
                intent.putExtra(Intent.EXTRA_TEXT, words);
                startActivity(intent);
            }
        });
    }

    private void toggleButton()
    {
        Boolean flag = true;
        for (int x=0; x<10; x++)
        {
            if (state[x])
            {
                flag = false;
            }

        }
        mShowMe.setEnabled(flag);

    }

}
