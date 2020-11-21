package com.atguigu.composite;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent {
	
	List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();
	
	public University(String name, String des) {
		super(name, des);

	}
	
	@Override
	protected void add(OrganizationComponent organizationComponent) {
		// TODO Auto-generated method stub
		organizationComponents.add(organizationComponent);
	}

	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		// TODO Auto-generated method stub
		organizationComponents.remove(organizationComponent);
	}
	public List<OrganizationComponent> getOrganizationComponents() {
		return organizationComponents;
	}

	public void setOrganizationComponents(List<OrganizationComponent> organizationComponents) {
		this.organizationComponents = organizationComponents;
	}

	@Override
	public void print() {
		System.out.println("------------------"+super.getName()+"---------------");
		// TODO Auto-generated method stub
		organizationComponents.forEach(i->System.out.println(
				i.getName() + ":" +i.getDes()
				));
	}
}
