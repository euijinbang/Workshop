import json


with open("./data.json", encoding="utf-8") as f:
    data = json.loads(f.read())

stores = []  # 음식점 테이블
reviews = []  # 리뷰 테이블
menus = []
users = []

for d in data:
    categories = [c["category"] for c in d["category_list"]]

    stores.append(
        [
            d["id"],
            d["name"],
            d["branch"],
            d["area"],
            d["tel"],
            d["address"],
            d["latitude"],
            d["longitude"],
            "|".join(categories),
        ]
    )

    for review in d["review_list"]:
        r = review["review_info"]
        u = review["writer_info"]

        reviews.append(
            [r["id"], d["id"], u["id"], r["score"], r["content"], r["reg_time"]]
        )

        users.append(
            [u["id"], u["gender"], u["born_year"]]
        )

    for menu in d["menu_list"]:
        menus.append(
            [d["id"], menu["menu"], menu["price"]]
        )

print("categories")
print(categories)
print("stores")
print(stores)
print("reviews")
print(reviews)
print("menus")
print(menus)
print("users")
print(users)
