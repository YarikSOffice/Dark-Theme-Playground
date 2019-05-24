package example.com.darkthemeplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class IgnoreOverrideForceDarkOptionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ignore_override_force_dark_option)
    }
}
