import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.blogdoapp.BlogData
import com.example.blogdoapp.R

class BlogAdapter(private val blogList: List<BlogData>) : RecyclerView.Adapter<BlogAdapter.BlogViewHolder>() {

    class BlogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userName: TextView = itemView.findViewById(R.id.txtUserName)
        val date: TextView = itemView.findViewById(R.id.txtDate)
        val time: TextView = itemView.findViewById(R.id.txtTime)
        val title: TextView = itemView.findViewById(R.id.txtTitle)
        val blog: TextView = itemView.findViewById(R.id.txtBlog)
        val btnLike: ImageButton = itemView.findViewById(R.id.imgLike)
        val btnLike2:ImageButton=itemView.findViewById(R.id.imgLike2)
        val btnSave: ImageButton = itemView.findViewById(R.id.imgSave)
        val btnSave2:ImageButton=itemView.findViewById(R.id.imgSave2)
    }

    override fun onCreateViewHolder(parent:ViewGroup, viewType: Int): BlogViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.blog_item2, parent, false)
        return BlogViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BlogViewHolder, position: Int) {
        val currentItem = blogList[position]
        holder.userName.text = currentItem.userName
        holder.date.text = currentItem.date
        holder.time.text = currentItem.time
        holder.title.text = currentItem.title
        holder.blog.text = currentItem.blog
        var isLike=currentItem.isLiked
        var isSave=currentItem.isSaved
        if(isLike){
            holder.btnLike2.visibility=View.VISIBLE
            holder.btnLike.visibility=View.GONE
        }else{
            holder.btnLike2.visibility=View.GONE
            holder.btnLike.visibility=View.VISIBLE
        }
        if(isSave){
            holder.btnSave2.visibility=View.VISIBLE
            holder.btnSave.visibility=View.GONE
        }else{
            holder.btnSave2.visibility=View.GONE
            holder.btnSave.visibility=View.VISIBLE
        }
        holder.btnLike2.setOnClickListener {
            // Update the data and UI for unlike action
            currentItem.isLiked = false
            isLike=false
            notifyItemChanged(position)
        }

        holder.btnLike.setOnClickListener {
            // Update the data and UI for like action
            currentItem.isLiked = true
            isLike=true
            notifyItemChanged(position)
        }
        holder.btnSave2.setOnClickListener {
            // Update the data and UI for unlike action
            currentItem.isSaved = false
            isSave=false
            notifyItemChanged(position)
        }

        holder.btnSave.setOnClickListener {
            // Update the data and UI for like action
            currentItem.isSaved = true
            isSave=true
            notifyItemChanged(position)
        }
    }

    override fun getItemCount() = blogList.size
}
