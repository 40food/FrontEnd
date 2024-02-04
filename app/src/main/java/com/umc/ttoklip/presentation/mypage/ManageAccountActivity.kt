package com.umc.ttoklip.presentation.mypage

import android.view.inputmethod.InputMethodManager
import androidx.core.view.isGone
import com.umc.ttoklip.R
import com.umc.ttoklip.databinding.ActivityManageAccountBinding
import com.umc.ttoklip.presentation.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ManageAccountActivity :
    BaseActivity<ActivityManageAccountBinding>(R.layout.activity_manage_account) {
    override fun initView() {
        binding.manageAccountInfoBackBtn.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
        binding.root.setOnClickListener {
            removeKeyboard()
        }
        binding.manageAccountInfoFrame.setOnClickListener {
            removeKeyboard()
        }

        binding.sendCertificationNumberBtn.setOnClickListener {
            binding.certificationNumberSentTv.isGone = false
        }
    }

    private fun removeKeyboard() {
        val imm: InputMethodManager =
            getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(currentFocus?.windowToken, 0)
    }

    override fun initObserver() = Unit

    companion object {

    }
}