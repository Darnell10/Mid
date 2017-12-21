package c4q.com.mid_unit_4;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by D on 12/20/17.
 */

public class BookAdapter extends RecyclerView.Adapter<BookHolder> {

    private List<Books> booksList;

    public BookAdapter(List<Books> booksList){
        this.booksList=booksList;
    }

    @Override
    public BookHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.booklayout,parent,false);
        return new BookHolder(childView);
    }

    @Override
    public void onBindViewHolder(BookHolder holder, int position) {
        Books books = booksList.get(position);
        holder.onBind(books);
    }

    @Override
    public int getItemCount() {
        return booksList.size();
    }
}
