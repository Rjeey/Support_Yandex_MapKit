package by.rjeey.dynamic.bus.scheduler.ui.map

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import by.rjeey.dynamic.bus.scheduler.R
import com.yandex.mapkit.Animation
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.mapview.MapView



class MapFragment : Fragment() {

    lateinit var mapview: MapView
    lateinit var imageview: ImageView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        MapKitFactory.setApiKey("a305ff24-d0df-4871-9a52-0ae434368133")
//        MapKitFactory.initialize(context)

        val root = inflater.inflate(R.layout.map_activity, container, false)
//        imageview = root.findViewById(R.id.map)
//        imageview.setImageResource(R.drawable.bus)

//        val root = inflater.inflate(R.layout.map_activity, container, false)
//
//        mapview = root.findViewById(R.id.mapview)
//        mapview.map.move(
//            CameraPosition( Point(55.751574, 37.573856), 11.0f, 0.0f, 0.0f),
//        Animation(Animation.Type.SMOOTH, 0f), null)

        return root
    }

    override fun onStop() {
        super.onStop()
//        mapview.onStop()
//        MapKitFactory.getInstance().onStop()

    }

    override fun onStart() {

        super.onStart()
//        mapview.onStart()
//        MapKitFactory.getInstance().onStart()
    }
}