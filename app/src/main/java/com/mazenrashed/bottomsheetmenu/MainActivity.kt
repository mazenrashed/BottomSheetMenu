package com.mazenrashed.bottomsheetmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import com.mazenrashed.MenuBottomSheet
import com.mazenrashed.bottomsheetmenulib.MenuBottomSheetItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.tryMenu).setOnClickListener {
            val menuItems = arrayListOf(
                MenuBottomSheetItem("Turn alarm on", R.drawable.ic_launcher_foreground),
                MenuBottomSheetItem("Turn alarm off", R.drawable.ic_launcher_foreground)
            )

            val bottomSheet = MenuBottomSheet.Builder()
                .setMenuRes(R.menu.test_menu)
//                    .setMenuItems(menuItems)
                .build()

            bottomSheet.onSelectMenuItemListener = { position: Int, id: Int? ->
                when (id) {
                    R.id.option1 -> Toast.makeText(this, "On", Toast.LENGTH_SHORT).show()
                    R.id.option2 -> Toast.makeText(this, "Off", Toast.LENGTH_SHORT).show()
                    else -> Toast.makeText(this, "Nothing", Toast.LENGTH_SHORT).show()
                }
            }

            bottomSheet.show(this)

        }
    }
}