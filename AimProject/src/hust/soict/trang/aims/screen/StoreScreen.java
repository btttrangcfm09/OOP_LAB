package hust.soict.trang.aims.screen;

import java.awt .*;
import java.awt.event .*;
import java.util.ArrayList;

import javax.swing .*;
import hust.soict. trang.aims.store.Store;
import hust.soict.trang.aims.media .*;
import hust.soict. trang.aims.cart .*;

public class StoreScreen extends JFrame{
	private Store store;
	private static Cart cart = new Cart () ;
	private JButton btnAddToCart, btnPlay;
	JPanel createNorth () {
		JPanel north = new JPanel () ;
		north.setLayout (new BoxLayout (north, BoxLayout. Y_AXIS) ) ;
		north.add (createMenuBar () );
		north.add (createHeader ());
		return north;
	}
	JMenuBar createMenuBar () {
		JMenu menu = new JMenu ("Options") ;
		JMenu smUpdateStore = new JMenu ("Update Store") ;
		smUpdateStore.add(new JMenuItem ("Add Book") );
		smUpdateStore.add(new JMenuItem ("Add CD") );
		smUpdateStore.add(new JMenuItem("Add DVD"));

        menu.add (smUpdateStore);
        menu.add (new JMenuItem ("View store") );
        menu.add(new JMenuItem("View cart") );
        
        JMenuBar menuBar = new JMenuBar () ;
        menuBar.setLayout (new FlowLayout (FlowLayout. LEFT) ) ;
        menuBar.add (menu);
        return menuBar;
    }
	JPanel createHeader () {
		JPanel header = new JPanel () ;
		header.setLayout (new BoxLayout (header, BoxLayout. X_AXIS) ) ;

		JLabel title = new JLabel ("AIMS") ;
		title.setFont (new Font(title.getFont ().getName (), Font.PLAIN,50));
		title.setForeground(Color. CYAN);

		JButton cart = new JButton ("View cart") ;
		cart.setPreferredSize(new Dimension (100,50));
		cart.setMaximumSize(new Dimension (100,50));

		header.add(Box.createRigidArea(new Dimension(10,10)));
		header.add(title);
		header.add(Box. createHorizontalGlue() );
		header.add(cart);
		header.add(Box.createRigidArea(new Dimension (10,10) ) );

		return header;
	}
	JPanel createCenter () {
		JPanel center = new JPanel() ;
		center.setLayout (new GridLayout (3, 3, 2, 2) );

		ArrayList<Media> mediaInStore = store.getItemsInStore () ;
		for (Media m: mediaInStore) {
			MediaStore cell = new MediaStore (m) ;
    		center.add(cell);
		}
		return center;
	}
	public class MediaStore extends JPanel {
		private Media media;

		public MediaStore (Media media) {
			this.media = media;
			this.setLayout (new BoxLayout (this, BoxLayout. Y_AXIS) ) ;

		    JLabel title = new JLabel (media.getTitle() );
		    title.setFont (new Font (title.getFont () .getName(), Font.PLAIN, 20));
		    title.setAlignmentX (CENTER_ALIGNMENT) ;

		    JLabel cost = new JLabel ("" + media.getCost () + " $") ;
		    cost.setAlignmentX (CENTER_ALIGNMENT) ;

       		JPanel container = new JPanel () ;
		    container.setLayout (new FlowLayout (FlowLayout. CENTER) ) ;

		    JButton btnAddToCart = new JButton ("Add to cart");
		    btnAddToCart.addActionListener (new ButtonListener (media, cart) ) ; //
		    container.add (btnAddToCart);

		    if (media instanceof Playable) {
		    	JButton btnPlay = new JButton ("Play");
		        btnPlay.addActionListener (new ButtonListener (media, cart) ) ; //
		        container.add(btnPlay);
		    }
		    this.add(Box.createVerticalGlue());
		    this.add(title);
		    this.add(cost);
		    this.add(Box.createVerticalGlue());
		    this.add(container);

		    this.setBorder (BorderFactory. createLineBorder(Color.BLACK) );

		}
	}
	public StoreScreen (Store store) {
		this. store = store;
		Container cp = getContentPane ();
		cp.setLayout (new BorderLayout () );

		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter (), BorderLayout. CENTER);

		setVisible (true) ;
		setTitle ("Store");
		setSize(1024,768);
	}
	public static void main (String[] args){
		Store store = new Store () ;
	    DigitalVideoDisc dvd1 = new DigitalVideoDisc("Lovely Dream", "DVD", "NoBody", 200, 150.2f);
	    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Big Story", "DVD", "NoBody", 300, 250.2f);
	    Book book1 = new Book ("Help me", "Book", "NoHope", 100.5f);
	    Book book2 = new Book("Winter", "Book", "NoHope", 200f) ;
	    Book book3 = new Book ("Summer", "Book", "NoHope", 300f) ;
	    Book book4 = new Book("Hate", "Book", "NoHope", 500.5f) ;
	    Book book5 = new Book("Autumn", "Book", "Sechar", 200f) ;
	    Book book6 = new Book("Kill", "Book", "Bob", 300f) ;
	// CD
	Track track1 = new Track ("Chrismast", 10);
	Track track2 = new Track ("And Chrismast", 20);
	CompactDisc cd = new CompactDisc("The album", "CD", 200f, "Dream Big");
	cd.addTrack(track1);
	cd.addTrack(track2);
	Track track3 = new Track ("Rose", 4);
	Track track4 = new Track ("Gone", 2);
	CompactDisc cd2 = new CompactDisc("Made cloud", "CD", 300f, "Dream High");
	cd2.addTrack(track3);
	cd2.addTrack(track4);
	// add to store
	store.addMedia (dvd1);
	store.addMedia (dvd2);
	store.addMedia (book1);
	store.addMedia (book2);
	store.addMedia (cd);
	store.addMedia (book3);
	store.addMedia(cd2);
	store.addMedia (book4);
	store.addMedia (book5);
	store.addMedia (book6);
	new StoreScreen (store) ;

	cart.print ();
	}
//	

	public class ButtonListener implements ActionListener {
	     private Media media; // Media liên quan đền nút
	     private Cart cart;// Gio hang de them Media

	     public ButtonListener (Media media, Cart cart) {
	    	 this.media = media;
	         this.cart = cart;
	     }
	     @Override
	     public void actionPerformed (ActionEvent e) {
	    	 String button = e.getActionCommand ();
	         JFrame frame = new JFrame ("JOptionPane") ;

	         if (button.equals ("Add to cart") ) {
	        	 cart.addMedia (media); // Thêm Media vào giỏ hàng
	             JOptionPane. showMessageDialog(frame,
	                              "The media \"" + media.getTitle () +
	                              "\" was added to the cart",
	                            "Add to cart", JOptionPane. INFORMATION_MESSAGE) ;
	             cart.print (); // In gio hang ra console
	         }
	        else if (button.equals ("Play") == true) {
	             JOptionPane. showMessageDialog(frame, "Play The Media",
	             "Play", JOptionPane. INFORMATION_MESSAGE) ;
	        }
	     }
	}
}
	
	