package com.umc.ttoklip.presentation.mypage

import android.content.Intent
import android.util.Log
import com.umc.ttoklip.R
import com.umc.ttoklip.TtoklipApplication
import com.umc.ttoklip.databinding.FragmentMyPageBinding
import com.umc.ttoklip.presentation.alarm.AlarmActivity
import com.umc.ttoklip.presentation.base.BaseFragment
import com.umc.ttoklip.presentation.login.LoginActivity
import com.umc.ttoklip.presentation.mypage.dialog.LogoutDialog
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MyPageFragment : BaseFragment<FragmentMyPageBinding>(R.layout.fragment_my_page) {
    override fun initObserver() = Unit

    override fun initView() {
        binding.userExpBar.isEnabled = false
        binding.noticeBtn.setOnClickListener {
            startActivity(AlarmActivity.newIntent(requireContext()))
        }
        binding.updateProfileBtn.setOnClickListener {
            val intent = Intent(requireContext(), ManageMyInfoActivity::class.java)
            startActivity(intent)
        }

        binding.announcementFrame.setOnClickListener {
            val intent = Intent(requireContext(), SetAnnouncementActivity::class.java)
            startActivity(intent)
        }

        binding.usageManageFrame.setOnClickListener {
            val intent = Intent(requireContext(), ManageUsageActivity::class.java)
            startActivity(intent)
        }

        binding.manageAccountFrame.setOnClickListener {
            val intent = Intent(requireContext(), ManageAccountActivity::class.java)
            startActivity(intent)
        }

        binding.noticeFrame.setOnClickListener {
            val intent = Intent(requireContext(), NoticeSettingActivity::class.java)
            startActivity(intent)
        }

        binding.customerServiceCenterFrame.setOnClickListener {
            val intent = Intent(requireContext(), CustomerServiceCenterActivity::class.java)
            startActivity(intent)
        }

        binding.termsPolicesFrame.setOnClickListener {
            val intent = Intent(requireContext(), TermsPolicesActivity::class.java)
            startActivity(intent)
        }

        binding.logoutFrame.setOnClickListener {
            val dialog = LogoutDialog {
                TtoklipApplication.prefs.setString("jwt", "")
                Log.d("token", TtoklipApplication.prefs.getString("jwt", ""))
                val intent = Intent(requireContext(), LoginActivity::class.java)
                startActivity(intent)
                requireActivity().finish()
            }
            dialog.show(parentFragmentManager, dialog.tag)
        }

        binding.transactionHistoryBtn.setOnClickListener {
            val intent = Intent(requireContext(), TransactionHistoryActivity::class.java)
            startActivity(intent)
        }

        binding.scrapBtn.setOnClickListener {
            val intent = Intent(requireContext(), SavedHoneyTipActivity::class.java)
            startActivity(intent)
        }

        binding.myHoneyTipBtn.setOnClickListener {
            val intent = Intent(requireContext(), MyHoneyTipActivity::class.java)
            startActivity(intent)
        }
    }

}