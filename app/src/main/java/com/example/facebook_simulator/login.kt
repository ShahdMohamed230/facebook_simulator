package com.example.facebook_simulator

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import com.example.facebook_simulator.databinding.FragmentLoginBinding
import com.example.facebook_simulator.databinding.FragmentRecyclerView2Binding
import com.example.facebook_simulator.databinding.ActivityMainBinding as ActivityMainBinding1


class login : Fragment() {
    lateinit var binding: FragmentLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       // val binding = FragmentLoginBinding.inflate(layoutInflater,container,false)
         binding = FragmentLoginBinding.inflate(layoutInflater)

        return binding.root

    }

    companion object {

        fun newInstance() =
            login().apply {
                arguments = Bundle().apply {

                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        FragmentLoginBinding.bind(view)
        binding.btnLogin.setOnClickListener{

            Navigation.findNavController(binding.root).navigate(R.id.action_login2_to_recyclerView)
        }
    }

}