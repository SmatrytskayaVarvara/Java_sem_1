package laba8;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Interface extends JFrame {
    List<Countries> countriesCatalog = new ArrayList<>(ActionsWithCatalog.CreateCountriesCatalog());

    static JButton add, delete, edit, sort, search, showData;
    static JTextField searchContinent, name, capital, square, population, continent, indexToDelete, indexToEdit, name2, capital2, square2, population2, continent2;
    static JTextArea catalog;
    static JLabel lSearchContinent, lname, lcapital, lsquare, lpopulation, lcontinent, lindexToDelete, lindexToEdit, lname2, lcapital2, lsquare2, lpopulation2, lcontinent2, error;

    public Interface(String str) {
        super(str);

        setSize(850, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lSearchContinent = new JLabel("Искомый континент:");
        lname = new JLabel("Название:");
        lcapital = new JLabel("Столица:");
        lsquare = new JLabel("Площадь:");
        lpopulation = new JLabel("Население:");
        lcontinent = new JLabel("Континент:");
        lindexToDelete = new JLabel("Введите индекс элемента для удаления: ");
        lindexToEdit = new JLabel("Введите индекс элемента для редактирования: ");
        lname2 = new JLabel("Название:");
        lcapital2 = new JLabel("Столица:");
        lsquare2 = new JLabel("Площадь:");
        lpopulation2 = new JLabel("Население:");
        lcontinent2 = new JLabel("Континент:");
        error = new JLabel("Ошибка ввода!");
        error.setForeground(Color.red);

        searchContinent = new JTextField();
        name = new JTextField();
        capital = new JTextField();
        square = new JTextField();
        population = new JTextField();
        continent = new JTextField();
        name2 = new JTextField();
        capital2 = new JTextField();
        square2 = new JTextField();
        population2 = new JTextField();
        continent2 = new JTextField();
        indexToDelete = new JTextField();
        indexToEdit = new JTextField();

        add = new JButton("Добавить");
        delete = new JButton("Удалить");
        edit = new JButton("Редактировать");
        sort = new JButton("Сортировать");
        search = new JButton("Найти");
        showData = new JButton(("Показать данные об элементе"));

        catalog = new JTextArea();
        catalog.setEditable(false);
        PrintTextToTextArea(countriesCatalog);


        setLayout(null);
        catalog.setLocation(20, 15);
        catalog.setSize(670, 100);
        sort.setLocation(20, 125);
        sort.setSize(150, 30);
        lSearchContinent.setLocation(190, 125);
        lSearchContinent.setSize(150, 30);
        searchContinent.setLocation(345, 125);
        searchContinent.setSize(150, 30);
        search.setLocation(495, 125);
        search.setSize(70, 30);

        add.setLocation(590, 190);
        add.setSize(110, 30);
        lname.setLocation(20, 165);
        lname.setSize(90, 30);
        lcapital.setLocation(120, 165);
        lcapital.setSize(60, 30);
        lsquare.setLocation(210, 165);
        lsquare.setSize(60, 30);
        lpopulation.setLocation(310, 165);
        lpopulation.setSize(75, 30);
        lcontinent.setLocation(390, 165);
        lcontinent.setSize(90, 30);
        name.setLocation(20, 190);
        name.setSize(90, 30);
        capital.setLocation(120, 190);
        capital.setSize(80, 30);
        square.setSize(80, 30);
        square.setLocation(210, 190);
        population.setLocation(310, 190);
        population.setSize(60, 30);
        continent.setLocation(390, 190);
        continent.setSize(120, 30);

        lindexToDelete.setSize(260, 30);
        lindexToDelete.setLocation(20, 230);
        indexToDelete.setSize(30, 30);
        indexToDelete.setLocation(265, 230);
        delete.setSize(90, 30);
        delete.setLocation(305, 230);

        lindexToEdit.setLocation(20, 285);
        lindexToEdit.setSize(290, 30);
        indexToEdit.setLocation(305, 285);
        indexToEdit.setSize(30, 30);
        showData.setLocation(335, 285);
        showData.setSize(220, 30);
        edit.setLocation(590, 340);
        edit.setSize(130, 30);
        lname2.setLocation(20, 315);
        lname2.setSize(90, 30);
        lcapital2.setLocation(120, 315);
        lcapital2.setSize(60, 30);
        lsquare2.setLocation(210, 315);
        lsquare2.setSize(60, 30);
        lpopulation2.setLocation(310, 315);
        lpopulation2.setSize(75, 30);
        lcontinent2.setLocation(390, 315);
        lcontinent2.setSize(90, 30);
        name2.setLocation(20, 340);
        name2.setSize(90, 30);
        capital2.setLocation(120, 340);
        capital2.setSize(80, 30);
        square2.setSize(80, 30);
        square2.setLocation(210, 340);
        population2.setLocation(310, 340);
        population2.setSize(60, 30);
        continent2.setLocation(390, 340);
        continent2.setSize(120, 30);

        add(catalog);
        add(sort);
        add(lSearchContinent);
        add(searchContinent);
        add(search);
        add(add);
        add(lname);
        add(lcapital);
        add(lsquare);
        add(lpopulation);
        add(lcontinent);
        add(name);
        add(capital);
        add(square);
        add(population);
        add(continent);
        add(lindexToDelete);
        add(indexToDelete);
        add(delete);
        add(lindexToEdit);
        add(indexToEdit);
        add(edit);
        add(lname2);
        add(lcapital2);
        add(lsquare2);
        add(lpopulation2);
        add(lcontinent2);
        add(name2);
        add(capital2);
        add(square2);
        add(population2);
        add(continent2);
        add(continent2);
        add(showData);
        add(error);

        sort.addActionListener(new SortActionListener());
        search.addActionListener(new SearchActionListener());
        add.addActionListener(new AddActionListener());
        delete.addActionListener(new DeleteActionListener());
        edit.addActionListener(new EditActionListener());
        showData.addActionListener(new ShowDataActionListener());
    }

    public void PrintTextToTextArea(List<Countries> countriesCatalog) {
        catalog.setText(null);
        for (Countries element : countriesCatalog) {
            catalog.append(element.toString());
        }
    }


    public class SortActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == sort) {
                PrintTextToTextArea(ActionsWithCatalog.sortCountriesByCapital(countriesCatalog));
            }
        }
    }

    public class SearchActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == search) {
                ActionsWithCatalog.SearchCountriesByContinent(countriesCatalog, searchContinent.getText());
            }
        }
    }

    public class AddActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == add) {
                    countriesCatalog.add(new Countries(name.getText(), capital.getText(), Integer.valueOf(square.getText()), Integer.valueOf(population.getText()), continent.getText()));
                    countriesCatalog.sort(new Countries.NameComparator());
                    name.setText(null);
                    capital.setText(null);
                    square.setText(null);
                    population.setText(null);
                    continent.setText(null);
                    PrintTextToTextArea(countriesCatalog);
                }

            } catch (NumberFormatException exception) {
                error.setSize(200, 30);
                error.setLocation(685, 190);
            }
        }
    }

    public class DeleteActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == delete) {
                    countriesCatalog.remove(Integer.parseInt(indexToDelete.getText()) - 1);
                    countriesCatalog.sort(new Countries.NameComparator());
                    PrintTextToTextArea(countriesCatalog);
                }
            } catch (IndexOutOfBoundsException exception) {
                error.setSize(200, 30);
                error.setLocation(400, 230);
            } catch (NumberFormatException exception2) {
                error.setSize(200, 30);
                error.setLocation(400, 230);
            }
        }
    }

    public class ShowDataActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == showData) {
                    name2.setText(countriesCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).getName());
                    capital2.setText(countriesCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).getCapital());
                    square2.setText(String.valueOf(countriesCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).getSquare()));
                    population2.setText(String.valueOf(countriesCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).getPopulation()));
                    continent2.setText(countriesCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).getContinent());
                }

            } catch (IndexOutOfBoundsException exception) {
                error.setSize(200, 30);
                error.setLocation(560, 285);
            } catch (NumberFormatException exception2) {
                error.setSize(200, 30);
                error.setLocation(560, 285);
            }
        }
    }

    public class EditActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == edit) {

                    countriesCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).setName(name2.getText());
                    countriesCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).setCapital(capital2.getText());
                    countriesCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).setSquare(Integer.parseInt(square2.getText()));
                    countriesCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).setPopulation(Integer.parseInt(population2.getText()));
                    countriesCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).setContinent(continent2.getText());
                    countriesCatalog.sort(new Countries.NameComparator());
                    PrintTextToTextArea(countriesCatalog);
                }
            } catch (NumberFormatException exception) {
                error.setSize(200, 30);
                error.setLocation(725, 340);
            }
        }
    }
}
