package com.example.a38

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

class BlankFragment6 : Fragment() {
    // ...
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view:View=inflater.inflate(R.layout.fragment_6, container, false)

        view.findViewById<Button>(R.id.ButtonBack).setOnClickListener(View.OnClickListener { view -> view.findNavController().popBackStack()})
        return view
    }
// ...
}