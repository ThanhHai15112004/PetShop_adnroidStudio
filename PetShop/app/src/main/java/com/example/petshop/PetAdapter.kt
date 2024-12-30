import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.petshop.Pet
import com.example.petshop.R

class PetAdapter(private val petList: List<Pet>) : RecyclerView.Adapter<PetAdapter.PetViewHolder>() {

    class PetViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val petImage: ImageView = view.findViewById(R.id.petImage)
        val petName: TextView = view.findViewById(R.id.petName)
        val petCode: TextView = view.findViewById(R.id.petCode)
        val petPrice: TextView = view.findViewById(R.id.petPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pet, parent, false)
        return PetViewHolder(view)
    }

    override fun onBindViewHolder(holder: PetViewHolder, position: Int) {
        val pet = petList[position]
        holder.petImage.setImageResource(pet.image)
        holder.petName.text = pet.name
        holder.petCode.text = pet.code
        holder.petPrice.text = pet.price
    }

    override fun getItemCount() = petList.size
}
