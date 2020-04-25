package com.capg.jpApp.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

    @Entity
    @Table(name="Author2")
	@Inheritance
	public class Author2 implements Serializable {
		@Id
		@Column(name="aid")
		private int authorId;
		@Column(name="aname")
		private String authorName;
		public Author2() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Author2(int authorId, String authorName) {
			super();
			this.authorId = authorId;
			this.authorName = authorName;
		}
		public int getAuthorId() {
			return authorId;
		}
		public void setAuthorId(int authorId) {
			this.authorId = authorId;
		}
		public String getAuthorName() {
			return authorName;
		}
		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}
		@Override
		public String toString() {
			return "Author [authorId=" + authorId + ", authorName=" + authorName
					+ "]";
		}

	}