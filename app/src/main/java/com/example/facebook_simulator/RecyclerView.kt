package com.example.facebook_simulator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.facebook_simulator.databinding.FragmentRecyclerView2Binding


class RecyclerView : Fragment() {
    lateinit var binding:FragmentRecyclerView2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding = FragmentRecyclerView2Binding.inflate(layoutInflater)
        return binding.root
    }

    companion object {

        fun newInstance() =
            RecyclerView().apply {
                arguments = Bundle().apply {

                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       FragmentRecyclerView2Binding.bind(view)
        val mArrayList=ArrayList<User>()
        mArrayList.add(User("John Tomas",R.drawable.profile1,"38 minutes ago",R.drawable.view2))
        mArrayList.add(User("Mohamed Othman",R.drawable.profile2,"42 minutes ago",R.drawable.view1))
        mArrayList.add(User("Hussein Ali",R.drawable.profile3,"50 minutes ago",R.drawable.view10))
        mArrayList.add(User("Mostafa Mohames",R.drawable.profile4,"50 minutes ago",R.drawable.view3))
        mArrayList.add(User("Noor Khaled",R.drawable.profile5,"1 hr ago",R.drawable.view9))
        mArrayList.add(User("Rana Ahmed",R.drawable.profile6,"3 hr ago",R.drawable.view4))
        mArrayList.add(User("sara Ali",R.drawable.profle7,"5 hr ago",R.drawable.view8))
        mArrayList.add(User("Saaja Omar",R.drawable.profile8,"8 hr ago",R.drawable.view5))
        mArrayList.add(User("Ali Ahmed",R.drawable.profile9,"Yesterday",R.drawable.view7))
        mArrayList.add(User("Elisa Ezz",R.drawable.profile10,"a week ago",R.drawable.view6))
        var recyclerView: RecyclerView =binding.mRecyclerView
        recyclerView.adapter=ItemAdapter(mArrayList)
    }


}