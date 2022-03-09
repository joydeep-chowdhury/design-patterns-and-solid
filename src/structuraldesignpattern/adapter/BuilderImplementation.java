package structuraldesignpattern.adapter;

public class BuilderImplementation implements Builder {
    BuilderAdapter builderAdapter;

    @Override
    public void build(String type, String location) {
        if(type.equalsIgnoreCase("House") || type.equalsIgnoreCase("Skyscrapper")) {
            builderAdapter = new BuilderAdapter(type);
            builderAdapter.build(type, location);
        } else {
            System.out.println("Invalid building type.");
        }
    }
}
