package com.bnyevrik.widgetexploration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.view.View
import android.widget.CompoundButton
import android.widget.RadioButton
import kotlinx.android.synthetic.main.exploration_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.exploration_layout)

        // Listen for clicks on the button,
        // the CheckBoxes and the RadioButtons

        // setOnCheckedChangeListener requires an interface of type
        // CompoundButton.OnCheckedChangeListener. In turn this interface
        // has a function called onCheckedChanged
        // It is all handled by the lambda
        checkBoxTransparency.setOnCheckedChangeListener { view, isChecked ->
            if (isChecked) {
                // Set some transparency
                imageView.alpha = .1f
            } else {
                // Remove transparency
                imageView.alpha = 1f
            }
        }

        checkBoxTint.setOnCheckedChangeListener { view, isChecked ->
            if (isChecked) {
                // Checked so set some tint
                imageView.setColorFilter(Color.argb(150, 255, 0, 0))
            } else {
                // No tint required
                imageView.setColorFilter(Color.argb(0, 0, 0, 0))
            }
        }

        checkBoxResize.setOnCheckedChangeListener {
            view, isChecked ->
            if (isChecked) {
                // It's checked so make bigger
                imageView.scaleX = 2f
                imageView.scaleY = 2f
            } else {
                // It's not checked so make regular size
                imageView.scaleX = 1f
                imageView.scaleY = 1f
            }
        }

        radioGroup.clearCheck()

        radioGroup.setOnCheckedChangeListener {
            group, checkedId ->
            val rb = group.findViewById<View>(checkedId) as RadioButton

            when (rb.id) {
                R.id.radioButtonLondon ->
                    textClock.timeZone = "Europe/London"

                R.id.radioButtonBeijing ->
                    textClock.timeZone = "CST6CDT"

                R.id.radioButtonNewYork ->
                    textClock.timeZone = "America/New_York"

                R.id.radioEuropeanEmpire ->
                    textClock.timeZone = "Europe/Brussels"
            }
        }

        /*
            Let's listen for clicks on our "Capture" Button.
            The compiler has worked out that the single function
            of the required interface has a single parameter.
            Therefore, the syntax is shortened (->) is removed
            and the only parameter, (should we have needed it)
            is declared invisibly as "it"
        */
        button.setOnClickListener {
            // it... accesses the view that was clicked

            // We want to act on the textView and editText instances
            // Change the text on the TextView
            // to whatever is currently in the EditText
            textView.text = editText.text
        }

        switch1.setOnCheckedChangeListener {
            buttonView, isChecked ->
            if (isChecked) {
                textView.visibility = View.VISIBLE
            } else {
                textView.visibility = View.INVISIBLE;
            }
        }
    }
}
