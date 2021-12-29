package by.rjeey.dynamic.bus.scheduler.model

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import by.rjeey.dynamic.bus.scheduler.R

class ListAdapter(items: ArrayList<Scheduler>, ctx: Context) :
    ArrayAdapter<Scheduler>(ctx, R.layout.list_item, items) {

    val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val scheduler: Scheduler? = getItem(position)

        var view: View? = convertView
        if (view == null) {
            view = inflater.inflate(R.layout.list_item, parent, false)
        }

        val imageView: ImageView = view!!.findViewById(R.id.imageTR)
        val transportName: TextView = view.findViewById(R.id.transportName)
        val location: TextView = view.findViewById(R.id.location)
        val time: TextView = view.findViewById(R.id.msgtime)

        imageView.setImageResource(scheduler!!.type)
        transportName.text = scheduler.name
        location.text = scheduler.location
        time.text = scheduler.time

        return view
    }

}