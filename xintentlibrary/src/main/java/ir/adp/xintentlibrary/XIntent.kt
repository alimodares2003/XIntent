package ir.adp.xintentlibrary

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import androidx.fragment.app.Fragment

/**
 * Created by Ali on 8/11/2019.
 */


fun Fragment.goActivity(activity: Class<*>) {
    val intent = Intent(context, activity)
    startActivity(intent)
}

fun Fragment.goActivity(intent: Intent) {
    startActivity(intent)
}

fun Fragment.goActivity(activity: Class<*>, names: Array<String>, vararg data: Any) {
    val intent = Intent(context, activity)
    for (j in 0 until data.size) {
        val item = data[j]
        var name = ""
        for (i in 0 until names.size) {
            name = names[j]
        }
        when (item) {
            is Boolean -> intent.putExtra(name, item)
            is Int -> intent.putExtra(name, item)
            is Long -> intent.putExtra(name, item)
            is Float -> intent.putExtra(name, item)
            is String -> intent.putExtra(name, item)
            is Double -> intent.putExtra(name, item)
            is Short -> intent.putExtra(name, item)
            is Parcelable -> intent.putExtra(name, item)
            is Array<*> -> intent.putExtra(name, item)
            is ArrayList<*> -> intent.putExtra(name, item)
            is DoubleArray -> intent.putExtra(name, item)
            is IntArray -> intent.putExtra(name, item)
            is CharArray -> intent.putExtra(name, item)
            is FloatArray -> intent.putExtra(name, item)
            is ShortArray -> intent.putExtra(name, item)
            is LongArray -> intent.putExtra(name, item)
            is Bundle -> intent.putExtra(name, item)
        }
    }
    startActivity(intent)
}

fun Fragment.goActivity(activity: Class<*>, model: Parcelable, name: String = "model") {
    val intent = Intent(context, activity)
    intent.putExtra(name, model)
    startActivity(intent)
}

fun Activity.goActivity(activity: Class<*>, isFinish: Boolean = false) {
    if (isFinish)
        finish()
    val intent = Intent(this, activity)
    startActivity(intent)
}

fun Activity.goActivity(intent: Intent, isFinish: Boolean = false) {
    if (isFinish)
        finish()
    startActivity(intent)
}

fun Activity.goActivity(activity: Class<*>, names: Array<String>, vararg data: Any, isFinish: Boolean = false) {
    if (isFinish)
        finish()
    val intent = Intent(this, activity)
    for (j in 0 until data.size) {
        val item = data[j]
        var name = ""
        for (i in 0 until names.size) {
            name = names[j]
        }
        when (item) {
            is Boolean -> intent.putExtra(name, item)
            is Int -> intent.putExtra(name, item)
            is Long -> intent.putExtra(name, item)
            is Float -> intent.putExtra(name, item)
            is String -> intent.putExtra(name, item)
            is Double -> intent.putExtra(name, item)
            is Short -> intent.putExtra(name, item)
            is Parcelable -> intent.putExtra(name, item)
            is Array<*> -> intent.putExtra(name, item)
            is ArrayList<*> -> intent.putExtra(name, item)
            is DoubleArray -> intent.putExtra(name, item)
            is IntArray -> intent.putExtra(name, item)
            is CharArray -> intent.putExtra(name, item)
            is FloatArray -> intent.putExtra(name, item)
            is ShortArray -> intent.putExtra(name, item)
            is LongArray -> intent.putExtra(name, item)
            is Bundle -> intent.putExtra(name, item)
        }
    }
    startActivity(intent)
}

fun Activity.goActivity(activity: Class<*>, model: Parcelable, name: String = "model", isFinish: Boolean = false) {
    if (isFinish)
        finish()
    val intent = Intent(this, activity)
    intent.putExtra(name, model)
    startActivity(intent)
}