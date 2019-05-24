package example.com.darkthemeplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_YES

class AlwaysDarkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_always_dark)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        // prefer AppCompatDelegate.setDefaultNightMode whenever possible to minimize unnecessary activity recreations
        // More info here: https://medium.com/androiddevelopers/appcompat-v23-2-daynight-d10f90c83e94
        delegate.localNightMode = MODE_NIGHT_YES

    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
