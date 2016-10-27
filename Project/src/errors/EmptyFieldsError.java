package errors;

public class EmptyFieldsError extends Throwable {
    private Boolean titleIsNull;
    private Boolean descriptionIsNull;
    private Boolean priceIsNull;

    public EmptyFieldsError(String title, String description, Double price) {
        titleIsNull = (title == null);
        descriptionIsNull = (description == null);
        priceIsNull = (price == null);
    }

    @Override
    public String getMessage(){
        StringBuilder message =  new StringBuilder("please fill in following fields:");
                if (titleIsNull) {message.append("\n The title ");}
                if (descriptionIsNull){message.append("\n The description ");}
                if (priceIsNull){message.append("\n The price");}
                message.append("\n They are not allowed to be null!");
        return message.toString();
    }
}
