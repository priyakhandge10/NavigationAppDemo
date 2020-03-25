package com.example.navigationdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_message_.*

/**
 * A simple [Fragment] subclass.
 */
class MessageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_message_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val message = arguments?.getString("msg")
        txtMessage.text = "Message send is: $message"

        back.setOnClickListener {
            view.findNavController().navigate(R.id.new_Fragment)
        }

        goBack.setOnClickListener {
            view.findNavController().navigate(R.id.contactfragment)
        }
    }

}
