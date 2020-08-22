package com.rulerbug.mypaginlast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.paging.PagedList
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv.layoutManager = LinearLayoutManager(this)
        rv.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        val jockPagedListAdapter = JockPagedListAdapter(this)
        val jockViewModel = ViewModelProviders.of(this).get(JockViewModel::class.java)
        jockViewModel.list.observe(this, object : Observer<PagedList<JockBean.ResultBean>> {
            override fun onChanged(t: PagedList<JockBean.ResultBean>?) {
                 jockPagedListAdapter.submitList(t)
            }
        })
        rv.adapter=jockPagedListAdapter
    }
}