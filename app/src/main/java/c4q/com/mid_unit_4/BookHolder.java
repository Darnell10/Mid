package c4q.com.mid_unit_4;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


/**
 * Created by D on 12/20/17.
 */

public class BookHolder extends RecyclerView.ViewHolder {

    private TextView title;
    private TextView author;
    private TextView year;


    public BookHolder(View itemView) {
        super(itemView);

        title = (TextView) itemView.findViewById(R.id.title_view);
        author = (TextView) itemView.findViewById(R.id.author_view);
        year = (TextView)itemView.findViewById(R.id.year);
    }

    public void onBind(Books books){
        final Books thisBooks = books;
        title.setText("Name of Book" + books.getTitle());
        author.setText("A book By " + books.getAuthor());
        year.setText("Publish in " + books.getYear());
    }

}
