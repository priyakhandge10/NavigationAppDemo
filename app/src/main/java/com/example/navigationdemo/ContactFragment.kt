package com.example.navigationdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_contactfragment.*

/**
 * A simple [Fragment] subclass.
 */
class ContactFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contactfragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buSend.setOnClickListener {
            val message= etMessage.text.toString()
            var bundle= Bundle()
            bundle.putString("msg", message)
            view.findNavController().navigate(R.id.action_contactfragment_to_message_Fragment2,bundle)

        }
        bBack.setOnClickListener {
            view.findNavController().navigate(R.id.new_Fragment)
        }
    }

}
