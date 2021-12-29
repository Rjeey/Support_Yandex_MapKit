package by.rjeey.dynamic.bus.scheduler.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Notifications is Empty"
    }
    val text: LiveData<String> = _text
}