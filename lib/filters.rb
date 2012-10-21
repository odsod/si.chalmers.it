class PrettyPrint < Nanoc::Filter
  identifier :prettyprint

  def run(content, params={})
    content = content.gsub(/<pre>/, '<pre class="prettyprint">')
  end
end
