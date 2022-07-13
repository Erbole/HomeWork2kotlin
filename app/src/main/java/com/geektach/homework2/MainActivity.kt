package com.geektach.homework2

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.URLUtil
import com.geektach.homework2.constancion.load
import com.geektach.homework2.constancion.showToast
import com.geektach.homework2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val image = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        imageUrl()
        onClick()
    }

    private fun onClick() {
        binding.btnRandom.setOnClickListener {
            randomBtn()
        }
        binding.btnSumbit.setOnClickListener {
            sumbitBtn()
        }
    }

    private fun randomBtn() {
        val random = (0 until image.size).random()
        binding.imageView.load(image[random])

    }

    private fun sumbitBtn() {
        val url = Uri.parse(binding.editText.text.toString())
        if (URLUtil.isValidUrl(url.toString())) {
            binding.imageView.load(url.toString())
            image.add(Uri.parse(binding.editText.text.toString()).toString())
            showToast(R.string.toastPerformed)
        } else {
            showToast(R.string.toast_null)
        }

    }

    private fun imageUrl() {
        image.add("http://www.rosphoto.com/images/u/articles/1510/7_5.jpg")
        image.add("https://static-cse.canva.com/blob/847064/29.jpg")
        image.add("https://s0.rbk.ru/v6_top_pics/media/img/5/46/756038770746465.jpg")
        image.add("https://www.biletik.aero/upload/medialibrary/807/807f262b60da392f1e09aa6d33f20a9b.png")
        image.add("https://prophotos.ru/data/articles/0002/2614/image-rectangle_600_x.jpg")
        image.add("https://klike.net/uploads/posts/2020-01/1578212659_1.jpeg")
        image.add("https://static-cse.canva.com/blob/847617/20201020T164031.354.jpg")
        image.add("https://images.pexels.com/photos/2449600/pexels-photo-2449600.png?auto=compress&cs=tinysrgb&dpr=1&w=500")
        image.add("https://wikiway.com/upload/resize_cache/uf/2ce/1024_800_1/gruzia_1.jpg")
        image.add("https://www.interfax.ru/ftproot/photos/photostory/2019/07/09/week4_700.jpg")
    }
}
