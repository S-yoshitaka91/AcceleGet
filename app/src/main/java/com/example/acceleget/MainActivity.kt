package com.example.acceleget

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() ,SensorEventListener {
    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onSensorChanged(event: SensorEvent?) {
        if(event == null)return
        if(event.sensor.type == Sensor.TYPE_ACCELEROMETER){
            txt01.text = "X軸:$｛event.values[0]｝\nY軸:$｛event.values[1]\nZ軸:$｛event.values[2]｝"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onRestart() {
        super.onRestart()
        val
    }
}
