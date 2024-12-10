package ru.anasoft.android_homework_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.anasoft.android_homework_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.customView.setTopText("верхняя строчка, настроенная из кода")
        binding.customView.setBottomText("нижняя строчка, настроенная из кода")
    }
}