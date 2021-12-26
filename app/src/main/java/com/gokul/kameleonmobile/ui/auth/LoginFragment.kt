package com.gokul.kameleonmobile.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.gokul.kameleonmobile.databinding.FragmentLoginBinding
import com.gokul.kameleonmobile.AuthViewModel

class LoginFragment :Fragment(){
    private var _binding:FragmentLoginBinding?=null
    val authViewModel: AuthViewModel by activityViewModels()
    private val TAG="CurrentUser"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentLoginBinding.inflate(inflater,container,false)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding?.apply {
            loginButton.setOnClickListener{
                authViewModel.login(
                    emailEditText.text.toString(),
                    passwordEditText.text.toString()
                )
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}