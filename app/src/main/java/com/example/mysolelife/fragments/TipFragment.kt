package com.example.mysolelife.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mysolelife.R
import com.example.mysolelife.contentsList.*
import com.example.mysolelife.databinding.FragmentTipBinding

class TipFragment : Fragment() {

    private lateinit var binding: FragmentTipBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.activity_tip_fragment, container, false)

        binding.button1.setOnClickListener {
            val intent = Intent(context, ContentsListActivity::class.java)
            startActivity(intent)
        }

        binding.button2.setOnClickListener {
            val intent = Intent(context, ContentsListActivity2::class.java)
            startActivity(intent)
        }

        binding.button3.setOnClickListener {
            val intent = Intent(context, ContentsListActivity3::class.java)
            startActivity(intent)
        }

        binding.button4.setOnClickListener {
            val intent = Intent(context, ContentsListActivity4::class.java)
            startActivity(intent)
        }

        binding.button5.setOnClickListener {
            val intent = Intent(context, ContentsListActivity5::class.java)
            startActivity(intent)
        }

        binding.button6.setOnClickListener {
            val intent = Intent(context, ContentsListActivity6::class.java)
            startActivity(intent)
        }

        binding.button7.setOnClickListener {
            val intent = Intent(context, ContentsListActivity7::class.java)
            startActivity(intent)
        }

        binding.button8.setOnClickListener {
            val intent = Intent(context, ContentsListActivity8::class.java)
            startActivity(intent)
        }

        binding.homeTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_tipFragment_to_homeFragment)
        }

        binding.talkTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_tipFragment_to_talkFragment)
        }

        binding.bookmarkTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_tipFragment_to_bookmarkFragment)
        }

        binding.storeTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_tipFragment_to_storeFragment)
        }


        return binding.root
    }
}
