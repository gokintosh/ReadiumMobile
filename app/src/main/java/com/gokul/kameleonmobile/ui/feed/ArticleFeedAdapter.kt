package com.gokul.kameleonmobile.ui.feed

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.AsyncDifferConfig
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.gokul.api.models.entities.Article
import com.gokul.kameleonmobile.R
import com.gokul.kameleonmobile.databinding.ListItemArticleBinding

class ArticleFeedAdapter:ListAdapter<Article,ArticleFeedAdapter.ArticleViewHolder>(
    object:DiffUtil.ItemCallback<Article>(){
        override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem==newItem
        }

        override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem.toString()==newItem.toString()
        }

    }
) {



    inner class ArticleViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {


        return ArticleViewHolder(
            parent.context.getSystemService(LayoutInflater::class.java).inflate(
                R.layout.list_item_article,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        ListItemArticleBinding.bind(holder.itemView).apply{
            val article=getItem(position)

            authorTextView.text=article.author.username
            titleTextView.text=article.title
            bodyTextView.text=article.body
            dateTextView.text="12 december 2021"
            authorImageView.background=ColorDrawable(Color.GRAY)
        }
    }
}