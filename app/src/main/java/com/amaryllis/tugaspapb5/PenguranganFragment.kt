package com.amaryllis.tugaspapb5

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PenguranganFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_pengurangan, container, false)

        val edtBilsatu = view.findViewById<EditText>(R.id.edt_bilsatu)
        val edtBildua = view.findViewById<EditText>(R.id.edt_bildua)
        val btnCalculate = view.findViewById<Button>(R.id.btn_calculate)
        val tvResult = view.findViewById<TextView>(R.id.tv_result)

        btnCalculate.setOnClickListener {
            val bilSatu = edtBilsatu.text.toString().toIntOrNull() ?: 0
            val bilDua = edtBildua.text.toString().toIntOrNull() ?: 0

            val kurang = bilSatu - bilDua
            tvResult.text = "$kurang"
        }
        return view
    }
}