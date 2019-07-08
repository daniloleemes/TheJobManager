package com.example.hp.thejobmanager.adapters

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.hp.thejobmanager.R
import com.example.hp.thejobmanager.databinding.SupervisorJobCardBinding
import com.example.hp.thejobmanager.viewModel.SupervisorJobViewModel

class SupervisorJobAdapter(private val context: Context, private val arrayList: ArrayList<SupervisorJobViewModel>):
    RecyclerView.Adapter<SupervisorJobAdapter.customView>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): customView {

        val layoutInflater= LayoutInflater.from(parent.context)

        val jobdisplaydesignBinding: SupervisorJobCardBinding = DataBindingUtil.inflate(layoutInflater,
            R.layout.supervisorjobcard,parent,false)

        return customView(jobdisplaydesignBinding)
    }

    override fun getItemCount(): Int {


        return arrayList.size
    }

    override fun onBindViewHolder(holder: customView, position: Int) {

        val jobListViewModel:SupervisorJobViewModel=arrayList[position]
        holder.bind(jobListViewModel)
    }


    class customView(val jobdisplaydesignBinding: SupervisorJobCardBinding):RecyclerView.ViewHolder(jobdisplaydesignBinding.root){

        fun bind(jobListViewModel: SupervisorJobViewModel){



            this.jobdisplaydesignBinding.supervisorjobmodel=jobListViewModel
            jobdisplaydesignBinding.executePendingBindings()
        }

    }
}