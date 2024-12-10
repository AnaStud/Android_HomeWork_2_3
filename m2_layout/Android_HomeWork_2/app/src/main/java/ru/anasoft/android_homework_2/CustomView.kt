package ru.anasoft.android_homework_2

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import ru.anasoft.android_homework_2.databinding.CustomViewBinding

class CustomView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
    ) : LinearLayout(context, attrs) {

    private val binding:CustomViewBinding

    init {
        val inflatedView = inflate(context, R.layout.custom_view, this)
        binding = CustomViewBinding.bind(inflatedView)
    }

    fun setTopText(newText: String) {
        binding.textViewTop.text = newText
    }

    fun setBottomText(newText: String) {
        binding.textViewBottom.text = newText
    }

}
