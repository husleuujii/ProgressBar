package com.example.progressbar

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {

        private var listener: OnFragmentInteractionListener? = null

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ) : View? {

            val root = inflater.inflate(R.layout.fragment_home, container, false)

            // TODO Start Progress Bar
            root.start.setOnClickListener {
                listener?.onStartProgressBar()
            }

            // TODO Stop Progress Bar
        root.stop.setOnClickListener {
            listener?.onStopProgressBar()
        }

        return root
    }

    override fun onAttach(context: Context) {
    super.onAttach(context)

    // TODO Connect Interface from MainActivity
    if (context is OnFragmentInteractionListener) {
        listener = context
    } else {
        throw RuntimeException()
    }
}

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    // TODO Implement Interface to MainActivity
    interface OnFragmentInteractionListener {
        fun onStartProgressBar()
        fun onStopProgressBar()
    }

}
