package by.rjeey.dynamic.bus.scheduler.ui.list_transport

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListView
import androidx.fragment.app.Fragment
import by.rjeey.dynamic.bus.scheduler.R
import by.rjeey.dynamic.bus.scheduler.model.ListAdapter
import by.rjeey.dynamic.bus.scheduler.model.Scheduler


class SchedulerList : Fragment(){
    lateinit var imageview: ImageView
    lateinit var listview: ListView

    var imageView = intArrayOf(
        R.drawable.bus,R.drawable.trolleybus,R.drawable.trolleybus,
        R.drawable.trolleybus,R.drawable.bus,R.drawable.bus,
        R.drawable.bus,R.drawable.bus,R.drawable.bus
    )
    var transportName = arrayOf("25", "52", "33", "140", "26", "72", "30c", "138", "25")
    var location = arrayOf(
        "мкр-н Сухарево-3", "мкр-н Сухарево-3", "мкр-н Сухарево-3", "мкр-н Сухарево-3", "мкр-н Сухарево-3",
        "мкр-н Сухарево-3", "мкр-н Сухарево-3", "мкр-н Сухарево-3", "мкр-н Сухарево-3"
    )
    var time = arrayOf(
        "8:45", "9:00", "7:34", "11:32", "6:30",
        "11:00", "7:34", "12:32", "7:30"
    )



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.scheduler_fragment, container, false)
        listview = root.findViewById(R.id.listview)

        var schedulerArrayList: ArrayList<Scheduler> = ArrayList()

        for(i in imageView.indices){

//            var scheduler:Scheduler = Scheduler(imageView[i],transportName[i],location[i],time[i])
            schedulerArrayList.add(Scheduler(imageView[i],transportName[i],location[i],time[i]))

        }

        var listAdapter: ListAdapter = ListAdapter(schedulerArrayList, this.context!!)

        listview.adapter = listAdapter

        return root
    }


    override fun onStop() {
        super.onStop()

    }

    override fun onStart() {
        super.onStart()
    }


}