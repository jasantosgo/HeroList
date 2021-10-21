/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.herolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HeroAdapter(val heroList: Array<String>) :
    RecyclerView.Adapter<HeroAdapter.HeroViewHolder>() {

    // Describes an item view and its place within the RecyclerView
    // Describe un elemento del recyclerView y lo posiciona en este.
    class HeroViewHolder(elemento: View) : RecyclerView.ViewHolder(elemento) {
        private val tvHero : TextView = elemento.findViewById(R.id.tvHeroe)

        fun bind(word: String) {
            tvHero.text = word
        }
    }

    // Returns a new ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.hero_item, parent, false)

        return HeroViewHolder(view)
    }

    // Returns size of data list
    override fun getItemCount(): Int {
        return heroList.size
    }

    // Displays data at a certain position
    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        holder.bind(heroList[position])
    }
}